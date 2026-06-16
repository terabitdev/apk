package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.CollectionMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class CreateCollectionSheetKt$CreateCollectionSheet$2$3$1 extends kotlin.jvm.internal.a implements ho.l {
    public CreateCollectionSheetKt$CreateCollectionSheet$2$3$1(Object obj) {
        super(1, 8, CreateCollectionViewModel.class, obj, "setIcon", "setIcon(Lio/elevenlabs/domain/model/CollectionMeta$Icon;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;");
    }

    public final void invoke(CollectionMeta.Icon icon) {
        icon.getClass();
        ((CreateCollectionViewModel) this.receiver).setIcon(icon);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CollectionMeta.Icon) obj);
        return sn.z.f31622a;
    }
}
