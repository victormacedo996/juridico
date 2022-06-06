import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RequisitoTemplateService {

  constructor(private http: HttpClient) { }

  buscarRequisitoTemplate(){
    let url = `${environment.apiBaseUrl}/api/requisitoTemplate`;
    return this.http.get(url);
  }
}