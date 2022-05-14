import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class TipoSolicitacaoService {

  constructor(private http: HttpClient) { }
  buscarTipoSolicitacao(){
    let url = `${environment.apiBaseUrl}/api/tipoSolicitacao`;
    return this.http.get(url);
  }
}
