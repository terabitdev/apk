package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.model.ReadMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadMeta f16972b;

    public /* synthetic */ r0(int i10, ReadMeta readMeta) {
        this.f16971a = i10;
        this.f16972b = readMeta;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f16971a) {
            case 0:
                return ReadShareDetailsViewModel$setReadId$1$1.d(this.f16972b, (ReadShareDetailsState) obj);
            default:
                return ReadShareOptionsViewModel$setReadId$1$1.d(this.f16972b, (ReadShareOptionsState) obj);
        }
    }
}
