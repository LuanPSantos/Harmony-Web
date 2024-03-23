import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HarmonicFieldContainerComponent } from './harmonic-field-container.component';

describe('HarmonicFieldContainerComponent', () => {
  let component: HarmonicFieldContainerComponent;
  let fixture: ComponentFixture<HarmonicFieldContainerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HarmonicFieldContainerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HarmonicFieldContainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
