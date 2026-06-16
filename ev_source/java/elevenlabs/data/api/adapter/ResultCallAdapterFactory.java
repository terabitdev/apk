package io.elevenlabs.data.api.adapter;

import com.google.protobuf.c6;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.domain.Logger;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import m8.b;
import vr.c;
import zs.d;
import zs.e;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\u0010\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/data/api/adapter/ResultCallAdapterFactory;", "Lzs/d;", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lvr/c;Lio/elevenlabs/domain/Logger;)V", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lzs/s0;", "retrofit", "Lzs/e;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lzs/s0;)Lzs/e;", "Lvr/c;", "Lio/elevenlabs/domain/Logger;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ResultCallAdapterFactory extends d {
    private final c json;
    private final Logger logger;

    public ResultCallAdapterFactory(c cVar, Logger logger) {
        cVar.getClass();
        logger.getClass();
        this.json = cVar;
        this.logger = logger;
    }

    @Override // zs.d
    public e get(Type returnType, Annotation[] annotations, s0 retrofit) {
        returnType.getClass();
        annotations.getClass();
        retrofit.getClass();
        if (!m.c(d.getRawType(returnType), zs.c.class)) {
            return null;
        }
        if (returnType instanceof ParameterizedType) {
            Type parameterUpperBound = d.getParameterUpperBound(0, (ParameterizedType) returnType);
            if (!m.c(d.getRawType(parameterUpperBound), ApiResult.class)) {
                return null;
            }
            if (parameterUpperBound instanceof ParameterizedType) {
                Type parameterUpperBound2 = d.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                parameterUpperBound2.getClass();
                return new ResultCallAdapter(parameterUpperBound2, this.json, this.logger);
            }
            c6.i("Response type must be a parameterized type. Is: ".concat(returnType.getClass().getName()));
            return null;
        }
        b.p(returnType, "Return type must be a parameterized type. Is: ");
        return null;
    }
}
