package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DragDropState f17251b;

    public /* synthetic */ a2(DragDropState dragDropState, int i10) {
        this.f17250a = i10;
        this.f17251b = dragDropState;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z invoke$lambda$0;
        sn.z DraggableItem$lambda$0$0;
        sn.z DraggableItem$lambda$1$0;
        switch (this.f17250a) {
            case 0:
                invoke$lambda$0 = ReorderableRowKt$ReorderableRow$3$1.invoke$lambda$0(this.f17251b, (o3.b) obj);
                return invoke$lambda$0;
            case 1:
                DraggableItem$lambda$0$0 = ReorderableRowKt.DraggableItem$lambda$0$0(this.f17251b, (p3.i0) obj);
                return DraggableItem$lambda$0$0;
            default:
                DraggableItem$lambda$1$0 = ReorderableRowKt.DraggableItem$lambda$1$0(this.f17251b, (p3.i0) obj);
                return DraggableItem$lambda$1$0;
        }
    }
}
