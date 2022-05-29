import { RegistroAnaliseAtendimento } from './../../../models/RegistroAnaliseAtendimento';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-type': 'application/json',
  }),
};

@Injectable({
  providedIn: 'root'
})
export class RegistroAnaliseAtendimentoService {

  url = `${environment.apiBaseUrl}/api/registroAnaliseAtendimento`;

  constructor(private http: HttpClient) { }

  public listaRegistroAtendimento(): Observable<RegistroAnaliseAtendimento[]>{
    const apiUrl = `${this.url}/`;
    return this.http.get<RegistroAnaliseAtendimento[]>(apiUrl);
  }

  public adicionarRegistroAtendimento(registroAnalise: RegistroAnaliseAtendimento): Observable<any>{
    const apiUrl = `${this.url}/adicionar`;
    return this.http.post<RegistroAnaliseAtendimento>(apiUrl, registroAnalise);
  }

  public atualizarRegistroAtendimento(registroAnalise: RegistroAnaliseAtendimento): Observable<any>{
    const apiUrl = `${this.url}/atualizar`;
    return this.http.put<RegistroAnaliseAtendimento>(apiUrl, registroAnalise);
  }

  public apagarFRegistroAtendimento(registroAtendimentoId: number): Observable<any>{
    const apiUrl = `${this.url}/apagar/${registroAtendimentoId}`;
    return this.http.delete<RegistroAnaliseAtendimento>(apiUrl);
   }
}