package io.livekit.android.dagger;

import androidx.room.m0;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class JsonFormatModule_KotlinSerializationJsonFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final JsonFormatModule_KotlinSerializationJsonFactory INSTANCE = new JsonFormatModule_KotlinSerializationJsonFactory();

        private InstanceHolder() {
        }
    }

    public static JsonFormatModule_KotlinSerializationJsonFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static vr.c kotlinSerializationJson() {
        vr.c kotlinSerializationJson = JsonFormatModule.INSTANCE.kotlinSerializationJson();
        m0.n(kotlinSerializationJson);
        return kotlinSerializationJson;
    }

    @Override // rn.a
    public vr.c get() {
        return kotlinSerializationJson();
    }
}
