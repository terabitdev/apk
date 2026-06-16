package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DragDropState f17282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2.z0 f17283c;

    public /* synthetic */ b2(DragDropState dragDropState, u2.z0 z0Var, int i10) {
        this.f17281a = i10;
        this.f17282b = dragDropState;
        this.f17283c = z0Var;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f17281a) {
            case 0:
                return ReorderableRowKt$ReorderableRow$3$1.b(this.f17282b, this.f17283c);
            default:
                return ReorderableRowKt$ReorderableRow$3$1.a(this.f17282b, this.f17283c);
        }
    }
}
