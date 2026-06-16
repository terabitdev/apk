package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17447a;

    public /* synthetic */ i0(int i10) {
        this.f17447a = i10;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        i3.t ReorderableRow$lambda$0;
        switch (this.f17447a) {
            case 0:
                return ComposableSingletons$CheckboxKt.a((i1.o) obj, ((Boolean) obj2).booleanValue(), (u2.m) obj3, ((Integer) obj4).intValue());
            case 1:
                return ComposableSingletons$ReorderableRowKt.a((t1.b) obj, (String) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
            default:
                ReorderableRow$lambda$0 = ReorderableRowKt.ReorderableRow$lambda$0(obj, ((Boolean) obj2).booleanValue(), (u2.m) obj3, ((Integer) obj4).intValue());
                return ReorderableRow$lambda$0;
        }
    }
}
