import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { RegistroAnaliseAtendimento } from '../models/RegistroAnaliseAtendimento';

@Injectable({
  providedIn: 'root'
})
export class AtendimentoRegistroService {

  constructor(private http: HttpClient) { }

  cadastrarRegistro(registro:RegistroAnaliseAtendimento){
    let url=`${environment.apiBaseUrl}/api/registro`
    return this.http.post(url, registro);
  }
}
