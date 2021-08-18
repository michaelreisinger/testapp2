import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContainerComponent } from './components/container/container.component';
import { ColorComponent } from './components/color/color.component';
import { NameComponent } from './components/name/name.component';
import { ButtonComponent } from './components/button/button.component';

@NgModule({
  declarations: [
    AppComponent,
    ContainerComponent,
    ColorComponent,
    NameComponent,
    ButtonComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
