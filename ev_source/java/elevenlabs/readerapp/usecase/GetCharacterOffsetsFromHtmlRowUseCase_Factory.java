package io.elevenlabs.readerapp.usecase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class GetCharacterOffsetsFromHtmlRowUseCase_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        static final GetCharacterOffsetsFromHtmlRowUseCase_Factory INSTANCE = new GetCharacterOffsetsFromHtmlRowUseCase_Factory();

        private InstanceHolder() {
        }
    }

    public static GetCharacterOffsetsFromHtmlRowUseCase_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GetCharacterOffsetsFromHtmlRowUseCase newInstance() {
        return new GetCharacterOffsetsFromHtmlRowUseCase();
    }

    @Override // rn.a
    public GetCharacterOffsetsFromHtmlRowUseCase get() {
        return newInstance();
    }
}
