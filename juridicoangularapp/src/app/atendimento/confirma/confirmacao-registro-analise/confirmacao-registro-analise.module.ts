import { ConfirmacaoRegistroAnaliseComponent } from './confirmacao-registro-analise.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatDialog } from '@angular/material/dialog';
import {MatDialogModule} from '@angular/material/dialog'
import { MatButtonModule } from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';

@NgModule({
  declarations: [ConfirmacaoRegistroAnaliseComponent],
  imports: [
    CommonModule,
    MatDialogModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule
  ],
  exports: [ConfirmacaoRegistroAnaliseComponent]
})
export class ConfirmacaoRegistroAnaliseModule { }
