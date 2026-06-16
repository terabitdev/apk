package io.livekit.android.audio;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class NoopCommunicationWorkaround_Factory implements ul.c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final NoopCommunicationWorkaround_Factory INSTANCE = new NoopCommunicationWorkaround_Factory();

        private InstanceHolder() {
        }
    }

    public static NoopCommunicationWorkaround_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NoopCommunicationWorkaround newInstance() {
        return new NoopCommunicationWorkaround();
    }

    @Override // rn.a
    public NoopCommunicationWorkaround get() {
        return newInstance();
    }
}
