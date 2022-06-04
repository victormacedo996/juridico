import { Component, OnInit } from '@angular/core';
import { timer } from 'rxjs';

@Component({
  selector: 'app-esculapio',
  templateUrl: './esculapio.component.html',
  styleUrls: ['./esculapio.component.css']
})
export class EsculapioComponent implements OnInit {
  texto: string = ''
  isTranslating: boolean = false
  signImage: string = ''
  constructor() { }

  ngOnInit(): void {
  }

  async traduzir() {
    this.isTranslating = true
    for (let letter of this.texto) {
      this.signImage = `./assets/signLanguage/${letter}.png`
      await this.waitforme(1000);
    }
    this.isTranslating = false
  }
  
  waitforme(ms:any)  {
    return new Promise( resolve => { setTimeout(resolve, ms); });
  }
}
