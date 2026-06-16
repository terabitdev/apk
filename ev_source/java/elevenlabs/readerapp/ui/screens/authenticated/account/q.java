package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchState;
import r1.z1;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.q {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15024a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn.d f15027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sn.d f15028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sn.d f15029f;

    public /* synthetic */ q(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, Boolean bool, ho.l lVar) {
        this.f15026c = aVar;
        this.f15027d = aVar2;
        this.f15028e = aVar3;
        this.f15029f = aVar4;
        this.Y = bool;
        this.f15025b = lVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z ContentPreferencesScreenUI$lambda$0;
        z SearchScreenUI$lambda$9$1;
        switch (this.f15024a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                ContentPreferencesScreenUI$lambda$0 = ContentPreferencesScreenKt.ContentPreferencesScreenUI$lambda$0((ho.a) this.f15026c, (ho.a) this.f15027d, (ho.a) this.f15028e, (ho.a) this.f15029f, (Boolean) this.Y, this.f15025b, (z1) obj, (u2.m) obj2, intValue);
                return ContentPreferencesScreenUI$lambda$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                SearchScreenUI$lambda$9$1 = SearchScreenKt.SearchScreenUI$lambda$9$1(this.f15025b, (SearchState) this.f15026c, (ho.l) this.f15027d, (ho.l) this.f15028e, (ho.l) this.f15029f, (ho.l) this.Y, (z1) obj, (u2.m) obj2, intValue2);
                return SearchScreenUI$lambda$9$1;
        }
    }

    public /* synthetic */ q(ho.l lVar, SearchState searchState, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.l lVar5) {
        this.f15025b = lVar;
        this.f15026c = searchState;
        this.f15027d = lVar2;
        this.f15028e = lVar3;
        this.f15029f = lVar4;
        this.Y = lVar5;
    }
}
