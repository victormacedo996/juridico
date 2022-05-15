import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { analiseJuridico } from 'src/app/models/analiseJuridico';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class RequisicaoService {
  url:string = `${environment.apiBaseUrl}/api/analiseJuridico`

  constructor(private http: HttpClient) { }
  criarRequisicao(requisicao:analiseJuridico){
    debugger;
    return this.http.post(this.url,requisicao);
  }
  atualizarRequisicao(){

  }
  deletarRequisicao(){

  }
  receberRequisicao(){

  }
}
