package io.elevenlabs.data.api.adapter;

import io.elevenlabs.domain.Logger;
import java.lang.reflect.Type;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import vr.c;
import zs.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/data/api/adapter/ResultCallAdapter;", "Lzs/e;", "", "Lzs/c;", "Lio/elevenlabs/data/model/ApiResult;", "Ljava/lang/reflect/Type;", "successType", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Ljava/lang/reflect/Type;Lvr/c;Lio/elevenlabs/domain/Logger;)V", "responseType", "()Ljava/lang/reflect/Type;", "call", "adapt", "(Lzs/c;)Lzs/c;", "Ljava/lang/reflect/Type;", "Lvr/c;", "Lio/elevenlabs/domain/Logger;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ResultCallAdapter implements e {
    private final c json;
    private final Logger logger;
    private final Type successType;

    public ResultCallAdapter(Type type, c cVar, Logger logger) {
        type.getClass();
        cVar.getClass();
        logger.getClass();
        this.successType = type;
        this.json = cVar;
        this.logger = logger;
    }

    @Override // zs.e
    public zs.c adapt(zs.c call) {
        call.getClass();
        return new ResultCall(call, this.json, this.logger);
    }

    @Override // zs.e
    /* renamed from: responseType, reason: from getter */
    public Type getSuccessType() {
        return this.successType;
    }
}
