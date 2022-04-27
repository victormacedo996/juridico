import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Empresa } from '../models/Empresa';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-type': 'application/json',
  }),
};

@Injectable({
  providedIn: 'root'
})
export class EmpresaService {

  url = `${environment.apiBaseUrl}/api/empresa`;

  constructor(private http: HttpClient) { }

  public listarEmpresas(): Observable<Empresa[]>{
    const apiUrl = `${this.url}/`;
    console.log(apiUrl);
    return this.http.get<Empresa[]>(apiUrl);
  }

  public adicionarUsuario(empresa: Empresa): Observable<any>{
    const apiUrl = `${this.url}/adicionar`;
    return this.http.post<Empresa>(apiUrl, empresa);
  }

  public atualizarUsuario(empresa: Empresa): Observable<any>{
    const apiUrl = `${this.url}/atualizar`;
    return this.http.put<Empresa>(apiUrl, empresa);
  }

  public apagarUsuario(empresaId: number): Observable<any>{
    const apiUrl = `${this.url}/apagar/${empresaId}`;
    return this.http.delete<Empresa>(apiUrl);
  }
}
