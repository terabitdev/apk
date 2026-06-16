package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15342b;

    public /* synthetic */ n(int i10, ho.a aVar) {
        this.f15341a = i10;
        this.f15342b = aVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z AddReadsToCollectionScreenUI$lambda$5;
        sn.z EditCollectionScreenUI$lambda$2;
        int i10 = this.f15341a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                AddReadsToCollectionScreenUI$lambda$5 = AddReadsToCollectionScreenKt.AddReadsToCollectionScreenUI$lambda$5(this.f15342b, mVar, intValue);
                return AddReadsToCollectionScreenUI$lambda$5;
            default:
                EditCollectionScreenUI$lambda$2 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$2(this.f15342b, mVar, intValue);
                return EditCollectionScreenUI$lambda$2;
        }
    }
}
