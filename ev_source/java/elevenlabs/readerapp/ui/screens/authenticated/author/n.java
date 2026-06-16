package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel$doInit$2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15232b;

    public /* synthetic */ n(String str, int i10) {
        this.f15231a = i10;
        this.f15232b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AuthorProfileState doInit$lambda$0;
        switch (this.f15231a) {
            case 0:
                return AuthorProfileViewModel$doInit$2.AnonymousClass1.a(this.f15232b, (AuthorProfileState) obj);
            default:
                doInit$lambda$0 = AuthorProfileViewModel.doInit$lambda$0(this.f15232b, (AuthorProfileState) obj);
                return doInit$lambda$0;
        }
    }
}
