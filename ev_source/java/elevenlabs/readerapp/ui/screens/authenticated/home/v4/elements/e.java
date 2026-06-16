package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import ho.p;
import io.elevenlabs.ui.echo.components.MenuKt;
import sn.z;
import u2.m;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15721a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15723c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15724d;

    public /* synthetic */ e(ho.a aVar, boolean z6, z0 z0Var) {
        this.f15723c = aVar;
        this.f15722b = z6;
        this.f15724d = z0Var;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z RecentReadItemV4$lambda$4$2;
        z MenuItem$lambda$1;
        switch (this.f15721a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                RecentReadItemV4$lambda$4$2 = HomeRecentReadsCarouselKt.RecentReadItemV4$lambda$4$2((ho.a) this.f15723c, this.f15722b, (z0) this.f15724d, (m) obj, intValue);
                return RecentReadItemV4$lambda$4$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                MenuItem$lambda$1 = MenuKt.MenuItem$lambda$1(this.f15722b, (String) this.f15723c, (String) this.f15724d, (m) obj, intValue2);
                return MenuItem$lambda$1;
        }
    }

    public /* synthetic */ e(boolean z6, String str, String str2) {
        this.f15722b = z6;
        this.f15723c = str;
        this.f15724d = str2;
    }
}
