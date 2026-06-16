package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f15320c;

    public /* synthetic */ i(ho.l lVar, z0 z0Var, int i10) {
        this.f15318a = i10;
        this.f15319b = lVar;
        this.f15320c = z0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z AddReadsToCollectionScreenUI$lambda$6$0$0$0;
        sn.z CreateCollectionSheetUI$lambda$3$3$0;
        sn.z EditCollectionScreenUI$lambda$3$0$0$4$0;
        switch (this.f15318a) {
            case 0:
                AddReadsToCollectionScreenUI$lambda$6$0$0$0 = AddReadsToCollectionScreenKt.AddReadsToCollectionScreenUI$lambda$6$0$0$0(this.f15319b, this.f15320c, (String) obj);
                return AddReadsToCollectionScreenUI$lambda$6$0$0$0;
            case 1:
                CreateCollectionSheetUI$lambda$3$3$0 = CreateCollectionSheetKt.CreateCollectionSheetUI$lambda$3$3$0(this.f15319b, this.f15320c, (String) obj);
                return CreateCollectionSheetUI$lambda$3$3$0;
            default:
                EditCollectionScreenUI$lambda$3$0$0$4$0 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$3$0$0$4$0(this.f15319b, this.f15320c, (String) obj);
                return EditCollectionScreenUI$lambda$3$0$0$4$0;
        }
    }
}
