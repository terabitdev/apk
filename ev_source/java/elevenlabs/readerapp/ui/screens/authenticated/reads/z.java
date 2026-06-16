package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.services.AddPodcastResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddPodcastResult.Success f17011b;

    public /* synthetic */ z(AddPodcastResult.Success success, int i10) {
        this.f17010a = i10;
        this.f17011b = success;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ImportFileState invokeSuspend$lambda$0;
        switch (this.f17010a) {
            case 0:
                invokeSuspend$lambda$0 = ImportFileViewModel$listen$1$1.invokeSuspend$lambda$0(this.f17011b, (ImportFileState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                return ImportLinkViewModel$onParsingCompleted$1$1.i(this.f17011b, (ImportLinkState) obj);
            default:
                return WriteViewModel$listen$1$1.n(this.f17011b, (WriteState) obj);
        }
    }
}
