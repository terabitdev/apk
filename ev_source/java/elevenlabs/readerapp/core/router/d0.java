package io.elevenlabs.readerapp.core.router;

import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileState;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFilterChipKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14404c;

    public /* synthetic */ d0(int i10, String str, String str2) {
        this.f14402a = i10;
        this.f14403b = str;
        this.f14404c = str2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        RouterState onTextShare$lambda$1;
        AuthorProfileState onSortChange$lambda$0;
        sn.z ExploreFilterChip$lambda$3$0;
        switch (this.f14402a) {
            case 0:
                onTextShare$lambda$1 = RouterViewModel.onTextShare$lambda$1(this.f14403b, this.f14404c, (RouterState) obj);
                return onTextShare$lambda$1;
            case 1:
                onSortChange$lambda$0 = AuthorProfileViewModel.onSortChange$lambda$0(this.f14403b, this.f14404c, (AuthorProfileState) obj);
                return onSortChange$lambda$0;
            case 2:
                ExploreFilterChip$lambda$3$0 = ExploreFilterChipKt.ExploreFilterChip$lambda$3$0(this.f14403b, this.f14404c, (p4.b0) obj);
                return ExploreFilterChip$lambda$3$0;
            default:
                p4.y.d(this.f14403b + ", " + this.f14404c, (p4.b0) obj);
                return sn.z.f31622a;
        }
    }
}
