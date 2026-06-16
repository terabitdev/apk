package io.elevenlabs.player.media;

import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import kotlin.Metadata;
import lb.a;
import livekit.LivekitInternal$NodeStats;
import w7.f0;
import w7.j;
import w7.j0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw7/f0;", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "", "useAudioPath", "configureDrm", "(Lw7/f0;Lio/elevenlabs/domain/model/ReadMeta;Z)Lw7/f0;", "player_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaItemDrmExtensionsKt {
    public static final f0 configureDrm(f0 f0Var, ReadMeta readMeta, boolean z6) {
        f0Var.getClass();
        readMeta.getClass();
        if (readMeta.getUseDrm() && ReadMetaKt.isMediaType(readMeta) && z6) {
            f0Var.f36325d = new j0(new a(j.f36393e)).a();
        }
        return f0Var;
    }
}
