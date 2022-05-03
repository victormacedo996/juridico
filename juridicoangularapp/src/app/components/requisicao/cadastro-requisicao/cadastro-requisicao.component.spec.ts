import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastroRequisicaoComponent } from './cadastro-requisicao.component';

describe('CadastroRequisicaoComponent', () => {
  let component: CadastroRequisicaoComponent;
  let fixture: ComponentFixture<CadastroRequisicaoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadastroRequisicaoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastroRequisicaoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
