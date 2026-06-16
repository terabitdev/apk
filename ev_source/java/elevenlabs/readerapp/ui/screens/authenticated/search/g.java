package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import ho.q;
import io.elevenlabs.domain.model.SearchSection;
import r1.l2;
import r1.s;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17036b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f17035a = i10;
        this.f17036b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z SearchScreenUI$lambda$9$0$1;
        z SearchScreenUI$lambda$9$1$3$0$6;
        z GenericItemRow$lambda$0;
        switch (this.f17035a) {
            case 0:
                SearchScreenUI$lambda$9$0$1 = SearchScreenKt.SearchScreenUI$lambda$9$0$1((ho.a) this.f17036b, (l2) obj, (m) obj2, ((Integer) obj3).intValue());
                return SearchScreenUI$lambda$9$0$1;
            case 1:
                SearchScreenUI$lambda$9$1$3$0$6 = SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$6((ho.l) this.f17036b, (t1.b) obj, (m) obj2, ((Integer) obj3).intValue());
                return SearchScreenUI$lambda$9$1$3$0$6;
            default:
                GenericItemRow$lambda$0 = SearchScreenKt.GenericItemRow$lambda$0((SearchSection.GenericItem) this.f17036b, (s) obj, (m) obj2, ((Integer) obj3).intValue());
                return GenericItemRow$lambda$0;
        }
    }
}
