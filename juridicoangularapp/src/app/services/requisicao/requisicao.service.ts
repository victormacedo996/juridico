import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { soliocitacaoAnaliseJuridico } from 'src/app/models/solocitacaoAnaliseJuridico';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class RequisicaoService {
  url:string = `${environment.apiBaseUrl}/api/analiseJuridico`

  constructor(private http: HttpClient) { }
  criarRequisicao(requisicao:soliocitacaoAnaliseJuridico){
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
