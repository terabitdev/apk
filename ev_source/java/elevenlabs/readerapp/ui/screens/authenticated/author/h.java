package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import ho.q;
import io.elevenlabs.domain.model.AuthorProfileSection;
import r1.l2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15214b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f15213a = i10;
        this.f15214b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z AuthorProfileContent$lambda$3$0$0$0$0;
        z AuthorProfileContent$lambda$3$0$0$0$2;
        z AuthorProfileScreenUi$lambda$4$0$0;
        switch (this.f15213a) {
            case 0:
                AuthorProfileContent$lambda$3$0$0$0$0 = AuthorProfileScreenKt.AuthorProfileContent$lambda$3$0$0$0$0((AuthorProfileSection.Header) this.f15214b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return AuthorProfileContent$lambda$3$0$0$0$0;
            case 1:
                AuthorProfileContent$lambda$3$0$0$0$2 = AuthorProfileScreenKt.AuthorProfileContent$lambda$3$0$0$0$2((AuthorProfileSection.Series) this.f15214b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return AuthorProfileContent$lambda$3$0$0$0$2;
            default:
                AuthorProfileScreenUi$lambda$4$0$0 = AuthorProfileScreenKt.AuthorProfileScreenUi$lambda$4$0$0((ho.a) this.f15214b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return AuthorProfileScreenUi$lambda$4$0$0;
        }
    }
}
