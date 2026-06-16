package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.CollectionMeta;
import r1.z1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15343a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditCollectionState f15345c;

    public /* synthetic */ n0(ho.l lVar, EditCollectionState editCollectionState) {
        this.f15344b = lVar;
        this.f15345c = editCollectionState;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z EditCollectionScreenUI$lambda$3;
        sn.z EditCollectionScreenUI$lambda$3$0$0$5;
        switch (this.f15343a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                EditCollectionScreenUI$lambda$3 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$3(this.f15345c, this.f15344b, (z1) obj, (u2.m) obj2, intValue);
                return EditCollectionScreenUI$lambda$3;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                EditCollectionScreenUI$lambda$3$0$0$5 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$3$0$0$5(this.f15344b, this.f15345c, (CollectionMeta.Icon) obj, (u2.m) obj2, intValue2);
                return EditCollectionScreenUI$lambda$3$0$0$5;
        }
    }

    public /* synthetic */ n0(EditCollectionState editCollectionState, ho.l lVar) {
        this.f15345c = editCollectionState;
        this.f15344b = lVar;
    }
}
