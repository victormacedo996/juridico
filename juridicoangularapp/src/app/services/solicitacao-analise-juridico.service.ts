import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { SolicitacaoAnaliseJuridico } from 'src/app/models/solicitacaoAnaliseJuridico';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-type': 'application/json',
  }),
};

@Injectable({
  providedIn: 'root'
})
export class SolicitacaoAnaliseJuridicoService {
  
  url = `${environment.apiBaseUrl}/api/solicitacaoAnaliseJuridico`;

  constructor(private http: HttpClient) { }

  public listarSolcitacaoAnaliseJuridico(): Observable<SolicitacaoAnaliseJuridico[]>{
    const apiUrl = `${this.url}/`;
    return this.http.get<SolicitacaoAnaliseJuridico[]>(apiUrl);
  }

  public registrarSolicitacaoAnaliseJuridico(solicitacaoAnaliseJuridico: SolicitacaoAnaliseJuridico) {
    const apiUrl = `${this.url}/adicionar`;
    return this.http.post<SolicitacaoAnaliseJuridico>(apiUrl, solicitacaoAnaliseJuridico);
  }
  public atualizarSolicitacaoAnaliseJuridico(solicitacaoAnaliseJuridico: SolicitacaoAnaliseJuridico) {
    const apiUrl = `${this.url}/atualizar`;
    return this.http.put<SolicitacaoAnaliseJuridico>(apiUrl, solicitacaoAnaliseJuridico);
  }
  public apagarSolicitacaoAnaliseJuridico(solicitacaoId: number) {
    const apiUrl = `${this.url}/apagar/${solicitacaoId}`;
    return this.http.delete<SolicitacaoAnaliseJuridico>(apiUrl);
  }

  public filtrarNumeroSolicitacaoAnaliseJuridico(numero:String){
    const apiUrl = `${this.url}/filtrarNumeroSolcitacao/${numero}`;
    return this.http.post(this.url, numero)
  }
}