package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import ae.l;
import ho.p;
import ho.q;
import i3.t;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt;
import io.elevenlabs.ui.components.ToastContainerKt;
import io.elevenlabs.ui.echo.components.MenuKt;
import l2.r0;
import sn.z;
import u2.m;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14960c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14962e;

    public /* synthetic */ e(CollectionMeta.Icon icon, boolean z6, ho.a aVar, int i10) {
        this.f14958a = 1;
        this.f14962e = icon;
        this.f14959b = z6;
        this.f14960c = aVar;
        this.f14961d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z CreditsActionButtons$lambda$1;
        z CollectionIconCell$lambda$1;
        z ToastContainer$lambda$1;
        z Menu$lambda$0;
        switch (this.f14958a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CreditsActionButtons$lambda$1 = AccountSummaryKt.CreditsActionButtons$lambda$1(this.f14959b, (ho.a) this.f14960c, (ho.a) this.f14962e, this.f14961d, (m) obj, intValue);
                return CreditsActionButtons$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                CollectionIconCell$lambda$1 = CreateCollectionSheetKt.CollectionIconCell$lambda$1((CollectionMeta.Icon) this.f14962e, this.f14959b, (ho.a) this.f14960c, this.f14961d, (m) obj, intValue2);
                return CollectionIconCell$lambda$1;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                ToastContainer$lambda$1 = ToastContainerKt.ToastContainer$lambda$1((p) this.f14962e, (ho.a) this.f14960c, this.f14959b, this.f14961d, (m) obj, intValue3);
                return ToastContainer$lambda$1;
            case 3:
                ((Integer) obj2).getClass();
                int M = r.M(this.f14961d | 1);
                l.c((t) this.f14962e, (ho.a) this.f14960c, this.f14959b, (m) obj, M);
                return z.f31622a;
            case 4:
                ((Integer) obj2).getClass();
                int M2 = r.M(this.f14961d | 1);
                kd.a.m(this.f14959b, (e5.j) this.f14960c, (r0) this.f14962e, (m) obj, M2);
                return z.f31622a;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                Menu$lambda$0 = MenuKt.Menu$lambda$0(this.f14959b, (ho.a) this.f14960c, (q) this.f14962e, this.f14961d, (m) obj, intValue4);
                return Menu$lambda$0;
        }
    }

    public /* synthetic */ e(Object obj, ho.a aVar, boolean z6, int i10, int i11) {
        this.f14958a = i11;
        this.f14962e = obj;
        this.f14960c = aVar;
        this.f14959b = z6;
        this.f14961d = i10;
    }

    public /* synthetic */ e(boolean z6, Object obj, Object obj2, int i10, int i11) {
        this.f14958a = i11;
        this.f14959b = z6;
        this.f14960c = obj;
        this.f14962e = obj2;
        this.f14961d = i10;
    }
}
