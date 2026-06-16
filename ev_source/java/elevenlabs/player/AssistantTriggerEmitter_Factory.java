package io.elevenlabs.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AssistantTriggerEmitter_Factory implements ul.c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final AssistantTriggerEmitter_Factory INSTANCE = new AssistantTriggerEmitter_Factory();

        private InstanceHolder() {
        }
    }

    public static AssistantTriggerEmitter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AssistantTriggerEmitter newInstance() {
        return new AssistantTriggerEmitter();
    }

    @Override // rn.a
    public AssistantTriggerEmitter get() {
        return newInstance();
    }
}
