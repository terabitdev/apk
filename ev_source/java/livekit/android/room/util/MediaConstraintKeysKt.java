package io.livekit.android.room.util;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaConstraints;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"findConstraint", "", "Llivekit/org/webrtc/MediaConstraints;", SubscriberAttributeKt.JSON_NAME_KEY, "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MediaConstraintKeysKt {
    public static final String findConstraint(MediaConstraints mediaConstraints, String str) {
        Object obj;
        Object obj2;
        String value;
        mediaConstraints.getClass();
        str.getClass();
        List<MediaConstraints.KeyValuePair> list = mediaConstraints.mandatory;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (m.c(((MediaConstraints.KeyValuePair) obj).getKey(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        MediaConstraints.KeyValuePair keyValuePair = (MediaConstraints.KeyValuePair) obj;
        if (keyValuePair != null && (value = keyValuePair.getValue()) != null) {
            return value;
        }
        List<MediaConstraints.KeyValuePair> list2 = mediaConstraints.optional;
        list2.getClass();
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (m.c(((MediaConstraints.KeyValuePair) obj2).getKey(), str)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        MediaConstraints.KeyValuePair keyValuePair2 = (MediaConstraints.KeyValuePair) obj2;
        if (keyValuePair2 == null) {
            return null;
        }
        return keyValuePair2.getValue();
    }
}
