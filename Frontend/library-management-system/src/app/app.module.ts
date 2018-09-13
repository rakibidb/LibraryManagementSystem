import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule, MatButtonModule, MatSidenavModule,MatCardModule,MatGridListModule, MatIconModule, MatListModule,MatTabsModule,MatProgressBarModule } from '@angular/material';
import { DefaultContentComponent } from './default-content/default-content.component';
import { RouterModule, Route } from '@angular/router';
import { BookComponent } from './book/book.component';
import { ErrorComponent } from './error/error.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { AuthorComponent } from './author/author.component';


const routes: Route[] = [
  {path: '', component: DefaultContentComponent },
  {path: 'book', component: BookComponent },
  {path: 'author', component: AuthorComponent },
  {path: '**', component: ErrorComponent },

  // {path: 'view2', component:____ },
  // {path: 'view3', component: ____ },
];

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    DefaultContentComponent,
    BookComponent,
    ErrorComponent,
    LoginFormComponent,
    AuthorComponent,
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    BrowserAnimationsModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatCardModule,
    MatTabsModule,
    MatGridListModule,
    MatProgressBarModule
  ],
  exports:[RouterModule],
  providers: [],
  bootstrap: [AppComponent]

})




export class AppModule { }
