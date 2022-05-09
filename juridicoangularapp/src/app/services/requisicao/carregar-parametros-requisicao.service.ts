import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class CarregarParametrosRequisicaoService {

  constructor(private http: HttpClient) { }

  carregarParametrosRequisicao(){
    let url = `${environment.apiBaseUrl}/api/analiseJuridico/obterParametros`;
    return this.http.get(url);
  }
}
