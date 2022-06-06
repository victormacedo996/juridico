import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PrioridadeService {

  constructor(private http: HttpClient) { }
  buscarPrioridade(){
    let url = `${environment.apiBaseUrl}/api/solicitacaoPrioridade`
    return this.http.get(url);
  }
}