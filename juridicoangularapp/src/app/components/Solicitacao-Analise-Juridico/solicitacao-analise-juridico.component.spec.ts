import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SolicitacaoAnaliseJuridicoComponent } from './solicitacao-analise-juridico.component';

describe('SolicitacaoAnaliseJuridicoComponent', () => {
  let component: SolicitacaoAnaliseJuridicoComponent;
  let fixture: ComponentFixture<SolicitacaoAnaliseJuridicoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SolicitacaoAnaliseJuridicoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SolicitacaoAnaliseJuridicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
