import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

import { environment } from 'src/environments/environment';

import { Usuario } from '../models/Usuario';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-type': 'application/json',
  }),
};

@Injectable({
  providedIn: 'root'
})

export class UsuarioService {

  url = `${environment.apiBaseUrl}/api/usuario`;

  constructor(private http: HttpClient) { }

  public listarUsuarios(): Observable<Usuario[]>{
    const apiUrl = `${this.url}/`;
    console.log(apiUrl);
    return this.http.get<Usuario[]>(apiUrl);
  }

}
