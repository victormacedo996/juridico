import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class SolicitacaoTipoRequisitoService {

  constructor(private http: HttpClient) { }

  buscarSolicitacoesTipoRequisito(){
    let url = `${environment.apiBaseUrl}/api/solicitaoTipoRequisito`;
    return this.http.get(url);
  }
}