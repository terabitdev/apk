package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.z0 f17528b;

    public /* synthetic */ n1(u2.z0 z0Var, int i10) {
        this.f17527a = i10;
        this.f17528b = z0Var;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Menu_ILWXrKs$lambda$2$0;
        sn.z Preview_ReorderableRow$lambda$3$0;
        switch (this.f17527a) {
            case 0:
                Menu_ILWXrKs$lambda$2$0 = MenuKt.Menu_ILWXrKs$lambda$2$0(this.f17528b, (h5.k) obj, (h5.k) obj2);
                return Menu_ILWXrKs$lambda$2$0;
            default:
                Preview_ReorderableRow$lambda$3$0 = ReorderableRowKt.Preview_ReorderableRow$lambda$3$0(this.f17528b, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return Preview_ReorderableRow$lambda$3$0;
        }
    }
}
