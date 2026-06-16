package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15203b;

    public /* synthetic */ d(int i10, ho.a aVar) {
        this.f15202a = i10;
        this.f15203b = aVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z AuthorProfileScreenUi$lambda$4$0;
        z AuthorProfileScreenUi$lambda$4;
        int i10 = this.f15202a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                AuthorProfileScreenUi$lambda$4$0 = AuthorProfileScreenKt.AuthorProfileScreenUi$lambda$4$0(this.f15203b, mVar, intValue);
                return AuthorProfileScreenUi$lambda$4$0;
            default:
                AuthorProfileScreenUi$lambda$4 = AuthorProfileScreenKt.AuthorProfileScreenUi$lambda$4(this.f15203b, mVar, intValue);
                return AuthorProfileScreenUi$lambda$4;
        }
    }
}
