package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import sn.z;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15199b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f15198a = i10;
        this.f15199b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z AuthorProfileContent$lambda$3$1$0;
        z AuthorProfileScreen$lambda$8$0$0;
        z AuthorProfileScreen$lambda$7$0;
        z AuthorProfileScreenUi$lambda$5$0$2$0;
        AuthorProfileState selectTab$lambda$0;
        switch (this.f15198a) {
            case 0:
                AuthorProfileContent$lambda$3$1$0 = AuthorProfileScreenKt.AuthorProfileContent$lambda$3$1$0((x0) this.f15199b, (h5.l) obj);
                return AuthorProfileContent$lambda$3$1$0;
            case 1:
                AuthorProfileScreen$lambda$8$0$0 = AuthorProfileScreenKt.AuthorProfileScreen$lambda$8$0$0((ho.p) this.f15199b, (String) obj);
                return AuthorProfileScreen$lambda$8$0$0;
            case 2:
                AuthorProfileScreen$lambda$7$0 = AuthorProfileScreenKt.AuthorProfileScreen$lambda$7$0((z0) this.f15199b, (String) obj);
                return AuthorProfileScreen$lambda$7$0;
            case 3:
                AuthorProfileScreenUi$lambda$5$0$2$0 = AuthorProfileScreenKt.AuthorProfileScreenUi$lambda$5$0$2$0((ho.l) this.f15199b, ((Integer) obj).intValue());
                return AuthorProfileScreenUi$lambda$5$0$2$0;
            default:
                selectTab$lambda$0 = AuthorProfileViewModel.selectTab$lambda$0((SelectedSubpage) this.f15199b, (AuthorProfileState) obj);
                return selectTab$lambda$0;
        }
    }
}
