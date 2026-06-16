package io.elevenlabs.domain;

import java.util.Arrays;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H\u0096\u0002¢\u0006\u0002\u0010\tJ)\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H&¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J1\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H&¢\u0006\u0002\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/StringProvider;", "", "invoke", "", "res", "", "getString", "args", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getQuantityString", "id", "count", "formatArgs", "(II[Ljava/lang/Object;)Ljava/lang/String;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface StringProvider {
    String getQuantityString(int id2, int count);

    String getQuantityString(int id2, int count, Object... formatArgs);

    String getString(int res);

    String getString(int res, Object... args);

    default String invoke(int res, Object... args) {
        args.getClass();
        return getString(res, Arrays.copyOf(args, args.length));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static String invoke(StringProvider stringProvider, int i10, Object... objArr) {
            objArr.getClass();
            return StringProvider.super.invoke(i10, objArr);
        }

        @Deprecated
        public static String invoke(StringProvider stringProvider, int i10) {
            return StringProvider.super.invoke(i10);
        }
    }

    default String invoke(int res) {
        return getString(res);
    }
}
