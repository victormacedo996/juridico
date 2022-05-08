import { RegistroAnaliseAtendimento } from './../../models/RegistroAnaliseAtendimento';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RegistroAnaliseAtendimentoService {

  url = `${environment.apiBaseUrl}/api/atendimento/registrarAnalise`;

  constructor(private http: HttpClient) { }

  listarEmpresas(): Observable<RegistroAnaliseAtendimento[]>{
    const apiUrl = `${this.url}/`;
    console.log(apiUrl);
    return this.http.get<RegistroAnaliseAtendimento[]>(apiUrl);
  }
}
