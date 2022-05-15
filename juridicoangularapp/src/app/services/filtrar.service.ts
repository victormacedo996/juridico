import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class FiltrarService {

  constructor(private http: HttpClient) { }
  url:string = `${environment.apiBaseUrl}/api/analiseJuridico/filtrar`
  filtrar(numero:String){
    return this.http.post(this.url, numero)
  }
}
