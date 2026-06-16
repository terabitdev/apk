package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.MediaItemState;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16197a;

    public /* synthetic */ j(int i10) {
        this.f16197a = i10;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f16197a) {
            case 0:
                return ComposableSingletons$PlayerScreenKt.a((h5.f) obj, (MediaItemState) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
            default:
                return Boolean.valueOf(PlayerTextSelectionConfigKt.a(((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), (String) obj4));
        }
    }
}
