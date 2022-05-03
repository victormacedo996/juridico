import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RequisicaoService {

  constructor(private http: HttpClient) { }
  criarRequisicao(){
    this.http.post
  }
  atualizarRequisicao(){

  }
  deletarRequisicao(){

  }
  receberRequisicao(){

  }
}
