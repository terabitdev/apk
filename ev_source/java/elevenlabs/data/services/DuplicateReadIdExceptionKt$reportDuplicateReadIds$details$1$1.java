package io.elevenlabs.data.services;

import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class DuplicateReadIdExceptionKt$reportDuplicateReadIds$details$1$1 extends kotlin.jvm.internal.j implements ho.l {
    public static final DuplicateReadIdExceptionKt$reportDuplicateReadIds$details$1$1 INSTANCE = new DuplicateReadIdExceptionKt$reportDuplicateReadIds$details$1$1();

    public DuplicateReadIdExceptionKt$reportDuplicateReadIds$details$1$1() {
        super(1, DuplicateReadIdExceptionKt.class, "describeRow", "describeRow(Lio/elevenlabs/domain/model/ReadMeta;)Ljava/lang/String;", 1);
    }

    @Override // ho.l
    public final String invoke(ReadMeta readMeta) {
        String describeRow;
        readMeta.getClass();
        describeRow = DuplicateReadIdExceptionKt.describeRow(readMeta);
        return describeRow;
    }
}
