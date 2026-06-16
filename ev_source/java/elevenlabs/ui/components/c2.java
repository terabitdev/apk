package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17297a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.z0 f17298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17301e;

    public /* synthetic */ c2(fr.d0 d0Var, u2.z0 z0Var, ActionSpec actionSpec, ActionConfig actionConfig) {
        this.f17301e = d0Var;
        this.f17299c = actionSpec;
        this.f17300d = actionConfig;
        this.f17298b = z0Var;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z invoke$lambda$3;
        sn.z Menu_ILWXrKs$lambda$3;
        sn.z SwipeToActionBox$lambda$21$2$1$0;
        switch (this.f17297a) {
            case 0:
                invoke$lambda$3 = ReorderableRowKt$ReorderableRow$3$1.invoke$lambda$3((DragDropState) this.f17299c, (c4.a0) this.f17300d, this.f17298b, (fr.d0) this.f17301e, (c4.v) obj, (o3.b) obj2);
                return invoke$lambda$3;
            case 1:
                int intValue = ((Integer) obj2).intValue();
                Menu_ILWXrKs$lambda$3 = MenuKt.Menu_ILWXrKs$lambda$3((j1.l0) this.f17299c, this.f17298b, (i3.t) this.f17300d, (Iterable) this.f17301e, (u2.m) obj, intValue);
                return Menu_ILWXrKs$lambda$3;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SwipeToActionBox$lambda$21$2$1$0 = SwipeToActionBoxKt.SwipeToActionBox$lambda$21$2$1$0((fr.d0) this.f17301e, (ActionSpec) this.f17299c, (ActionConfig) this.f17300d, this.f17298b, (u2.m) obj, intValue2);
                return SwipeToActionBox$lambda$21$2$1$0;
        }
    }

    public /* synthetic */ c2(DragDropState dragDropState, c4.a0 a0Var, u2.z0 z0Var, fr.d0 d0Var) {
        this.f17299c = dragDropState;
        this.f17300d = a0Var;
        this.f17298b = z0Var;
        this.f17301e = d0Var;
    }

    public /* synthetic */ c2(j1.l0 l0Var, u2.z0 z0Var, i3.t tVar, Iterable iterable) {
        this.f17299c = l0Var;
        this.f17298b = z0Var;
        this.f17300d = tVar;
        this.f17301e = iterable;
    }
}
