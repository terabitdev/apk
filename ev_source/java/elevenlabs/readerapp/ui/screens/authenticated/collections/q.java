package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.ui.components.SectionHeaderKt;
import r1.z1;
import s4.y0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15351a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f15352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f15353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15355e;

    public /* synthetic */ q(float f10, String str, y0 y0Var, ho.a aVar) {
        this.f15352b = f10;
        this.f15354d = str;
        this.f15355e = y0Var;
        this.f15353c = aVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z ExploreCollectionScreenUI$lambda$8$1;
        sn.z SectionHeader$lambda$2;
        switch (this.f15351a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                ExploreCollectionScreenUI$lambda$8$1 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1((CollectionState) this.f15354d, (ho.l) this.f15355e, this.f15352b, this.f15353c, (z1) obj, (u2.m) obj2, intValue);
                return ExploreCollectionScreenUI$lambda$8$1;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                SectionHeader$lambda$2 = SectionHeaderKt.SectionHeader$lambda$2(this.f15352b, (String) this.f15354d, (y0) this.f15355e, this.f15353c, (r1.s) obj, (u2.m) obj2, intValue2);
                return SectionHeader$lambda$2;
        }
    }

    public /* synthetic */ q(CollectionState collectionState, ho.l lVar, float f10, ho.a aVar) {
        this.f15354d = collectionState;
        this.f15355e = lVar;
        this.f15352b = f10;
        this.f15353c = aVar;
    }
}
