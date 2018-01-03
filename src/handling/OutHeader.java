package handling;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2/18/2017.
 */
public enum OutHeader {

    // CLogin::OnPacket
    CHECK_PASSWORD_RESULT(0),
    WORLD_INFORMATION(1),
    LATEST_CONNECTED_WORLD(2),
    RECOMMENDED_WORLD_MESSAGE(3),
    SET_CLIENT_KEY(4),
    SET_PHYSICAL_WORLD_ID(5),
    SELECT_WORLD_RESULT(6),
    SELECT_CHARACTER_RESULT(7),
    ACCOUNT_INFO_RESULT(8),
    CREATE_MAPLE_ACCOUNT_RESULT(9),
    CHECK_DUPLICATED_ID_RESULT(10),
    CREATE_NEW_CHARACTER_RESULT(11),
    DELETE_CHARACTER_RESULT(12),
    RESERVED_DELETE_CHARACTER_RESULT(13),
    RESERVED_DELETE_CHARACTER_CANCEL_RESULT(14),
    RENAME_CHARACTER_RESULT(15),
    PING(18),
    HEARTBEAT_RESPONSE(23),
    CHANGE_SPW_RESULT(24),
    ALBA_RESULT(29),
    SET_AUTO_SELECTED_WORLD(32),
    WORLD_INFO_FOR_SHINING_RESULT(33),
    CLIENT_START(36),
    SERVER_STATUS(38),
    AUTH_SERVER(47),

    // CWvsContext::OnPacket
    INVENTORY_OPERATION(71),
    INVENTORY_GROW(72),
    STAT_CHANGED(73),
    TEMPORARY_STAT_SET(74),
    TEMPORARY_STAT_RESET(75),
    FORCED_STAT_SET(76),
    FORCED_STAT_RESET(77),
    CHANGE_SKILL_RECORD_RESULT(78),
    CHANGE_STEAL_MEMORY_RESULT(79),
    USER_DAMAGE_ON_FALLING_CHECK(80),
    PERSONAL_SHOP_BUY_CHECK(81),
    MOB_DROP_MESO_PICKUP(82),
    BREAK_TIME_FIELD_ENTER(83),
    RUNE_ACT_SUCCESS(84),
    RESULT_STEAL_SKILL_LIST(85),
    SKILL_USE_RESULT(86),
    EXCL_REQUEST(87),
    GIVE_POPULARITY_RESULT(88),
    MESSAGE(89),
    MEMO_RESULT(90),
    MAP_TRANSFER_RESULT(91),
    ANTI_MACRO_RESULT(92),
    ANTI_MACRO_BOMB_RESULT(93),
    CLAIM_RESULT(95),
    SET_CLAIM_SVR_AVAILABLE_TIME(96),
    CLAIM_SVR_STATUS_CHANGED(97),
    STAR_PLANET_USER_COUNT(98),
    SET_TAMING_MOB_INFO(99),
    QUEST_CLEAR(100),
    ENTRUSTED_SHOP_CHECK_RESULT(101),
    SKILL_LEARN_ITEM_RESULT(102),
    SKILL_RESET_ITEM_RESULT(103),
    ABILITY_RESET_ITEM_RESULT(104),
    EXP_CONSUME_ITEM_RESULT(105),
    EXP_ITEM_GET_RESULT(106),
    CHAR_SLOT_INC_RESULT(107),
    CHAR_RENAME_RESULT(108),
    GATHER_ITEM_RESULT(109),
    SORT_ITEM_RESULT(110),
    CHARACTER_INFO(113),
    PARTY_RESULT(114),
    PARTY_MEMBER_CANDIDATE_RESULT(115),
    URUS_PARTY_MEMBER_CANDIDATE_RESULT(116),
    PARTY_CANDIDATE_RESULT(117),
    URUS_PARTY_RESULT(118),
    INTRUSION_FRIEND_CANDIDATE_RESULT(119),
    INTRUSION_LOBBY_CANDIDATE_RESULT(120),
    EXPEDITION_RESULT(122),
    FRIEND_RESULT(123),
    STAR_FRIEND_RESULT(124),
    LOAD_ACCOUNT_ID_OF_CHARACTER_FRIEND_RESULT(125),
    GUILD_REQUEST(126),
    GUILD_RESULT(127),
    ALLIANCE_RESULT(128),
    TOWN_PORTAL(129),
    BROADCAST_MSG(130),
    INCUBATOR_RESULT(132),
    INCUBATOR_HOT_ITEM_RESULT(133),
    SHOP_SCANNER_RESULT(134),
    SHOP_LINK_RESULT(135),
    AUCTION_RESULT(136),
    AUCTION_MESSAGE(137),
    MARRIAGE_REQUEST(138),
    MARRIAGE_RESULT(139),
    WEDDING_GIFT_RESULT(140),
    NOTIFY_MARRIED_PARTNER_MAP_TRANSFER(141),
    CASH_PET_FOOD_RESULT(142),
    CASH_PET_PICK_UP_ON_OFF_RESULT(143),
    CASH_PET_SKILL_SETTING_RESULT(144),
    CASH_LOOK_CHANGE_RESULT(145),
    CASH_PET_DYEING_RESULT(146),
    SET_WEEK_EVENT_MESSAGE(147),
    SET_POTION_DISCOUNT_RATE(148),
    BRIDLE_MOB_CATCH_FAIL(149),
    SOME_DECODE1(150),
    IMITATED_NPC_DATA(151),
    LIMITED_NPC_DISABLE_INFO(153),
    MONSTER_BOOK_SET_CARD(154),
    MONSTER_BOOK_SET_COVER(155),
    HOUR_CHANGE(156),
    MINIMAP_ON_OFF(157),
    CONSULT_AUTH_KEY_UPDATE(158),
    CLASS_COMPETITION_AUTH_KEY_UPDATE(159),
    WEB_BOARD_AUTH_KEY_UPDATE(160),
    SESSION_VALUE(161),
    PARTY_VALUE(162),
    FIELD_SET_VARIABLE(163),
    FIELD_VALUE(164),
    BONUS_EXP_RATE_CHANGED(165),
    FAMILY_CHART_RESULT(166),
    FAMILY_INFO_RESULT(167),
    FAMILY_RESULT(168),
    FAMILY_JOIN_REQUEST(169),
    FAMILY_JOIN_REQUEST_RESULT(170),
    FAMILY_JOIN_ACCEPTED(171),
    FAMILY_PRIVILEGE_LIST(172),
    FAMILY_FAMOUS_POINT_INC_RESULT(173),
    FAMILY_NOTIFY_LOGIN_OR_LOGOUT(174),
    FAMILY_SET_PRIVILEGE(175),
    FAMILY_SUMMON_REQUEST(176),
    NOTIFY_LEVEL_UP(177),
    NOTIFY_WEDDING(178),
    NOTIFY_JOB_CHANGE(179),
    SET_BUY_EQUIP_EXT(180),
    SET_PASSENSER_REQUEST(181), // typo?
    SCRIPT_PROGRESS_MESSAGE_BY_SOUL(182),
    SCRIPT_PROGRESS_MESSAGE(183),
    SCRUOT_PROGRESS_ITEM_MESSAGE(184),
    STATIC_SCREEN_MESSAGE(185),
    OFF_STATIC_SCREEN_MESSAGE(186),
    WEATHER_EFFECT_NOTICE(187),
    WEATHER_EFFECT_NOTICE_Y(188),
    PROGRESS_MESSAGE_FONT(189),
    DATA_CRC_CHECK_FAILED(190),
    SHOW_SLOT_MESSAGE(191),
    WILD_HUNTER_INFO(192),
    ZERO_INFO(193),
    ZERO_WP(194),
    ZERO_INFO_SUB_HP(195),
    UI_OPEN(196),
    CLEAR_ANNOUNCED_QUEST(197),
    RESULT_INSTANCE_TABLE(198),
    COOL_TIME_SET(199),
    ITEM_POT_CHANGE(200),
    SET_ITEM_COOL_TIME(201),
    SET_AD_DISPLAY_INFO(202),
    SET_AD_DISPLAY_STATUS(203),
    SET_SON_OF_LINKED_SKILL_RESULT(204),
    SET_MAPLE_STYLE_INFO(205),
    SET_BUY_LIMIT_COUNT(206),
    RESET_BUY_LIMIT_COUNT(207),
    UPDATE_UI_EVENT_LIST_INFO(208),
    DOJANG_RANKING_RESULT(209),
    SHUTDOWN_MESSAGE(212),
    RESULT_SET_STEAL_SKILL(213),
    SLASH_COMMAND(214),
    START_NAVIGATION(215),
    FUNCKEY_SET_BY_SCRIPT(216),
    CHARACTER_POTENTIAL_SET(217),
    CHARACTER_POTENTIAL_RESET(218),
    CHARACTER_HONOR_EXP(219),
    ASWAN_RESULT(221),
    READY_FOR_RESPAWN(222),
    READY_FOR_RESPAWN_BY_POINT(223),
    OPEN_READY_FOR_RESPAWN_U_I(224),
    CHARACTER_HONOR_GIFT(225),
    CROSS_HUNTER_COMPLETE_RESULT(226),
    CROSS_HUNTER_SHOP_RESULT(227),
    SET_CASH_ITEM_NOTICE(228),
    SET_SPECIAL_CASH_ITEM(229),
    SHOW_EVENT_NOTICE(230),
    BOARD_GAME_RESULT(231),
    YUT_GAME_RESULT(232),
    VALUE_PACK_RESULT(233),
    NAVI_FLYING_RESULT(234),
    SET_EXCL_REQUEST_SENT(235),
    CHECK_WEDDING_EX_RESULT(236),
    BINGO_RESULT(237),
    BINGO_CASSANDRA_RESULT(238),
    UPDATE_VIP_GRADE(239),
    MESO_RANGER_RESULT(240),
    SET_MAPLE_POINT(241),
    SET_MIRACLE_TIME_INFO(243),
    HYPER_SKILL_RESET_RESULT(244),
    GET_SERVER_TIME(245),
    GET_CHARACTER_POSITION(246),
    RETURN_EFFECT_CONFIRM(248),
    RETURN_EFFECT_MODIFIED(249),
    WHITE_ADDTIONAL_CUBE_RESULT(250),
    BLACK_CUBE_RESULT(251),
    MEMORIAL_CUBE_RESULT(252),
    MEMORIAL_CUBE_MODIFIED(253),
    DRESS_UP_INFO_MODIFIED(254),
    RESET_STATE_FOR_OFF_SKILL(255),
    SET_OFF_STATE_FOR_OFF_SKILL(256),
    ISSUE_RELOGIN_COOKIE(257),
    AVATAR_PACK_TEST(258),
    EVOLVING_RESULT(259),
    ACTIBAR_RESULT(260),
    GUILD_SEARCH_RESULT(262),
    HALLOWEEN_CANDY_RANKING_RESULT(264),
    GET_REWARD_RESULT(265),
    MENTORING(266),
    GET_LOTTERY_RESULT(267),
    CHECK_PROCESS_RESULT(268),
    COMPLETE_NPC_SPEECH_SUCCESS(269),
    COMPLETE_SPECIAL_CHECK_SUCCESS(270),
    SET_ACCOUNT_INFO(271),
    SET_GACHAPFEVER_TIME_INFO(272),
    AVATAR_MEGAPHONE_RES(273),
    SET_AVATAR_MEGAPHONE(274),
    CLEAR_AVATAR_MEGAPHONE(275),
    REQUEST_EVENT_LIST(276),
    LIKE_POINT(277),
    SIGN_ERROR_ACK(278),
    ASK_AFTER_ERROR_ACK(279),
    EVENT_NAME_TAG(280),
    ACQUIRE_EVENT_NAME_TAG(281),
    JOB_FREE_CHANGE_RESULT(282),
    EVENT_LOTTERY_OPEN(283),
    EVENT_LOTTERY_RESULT(284),
    TRADE_BLOCK_FOR_SNAP_SHOT(292),
    LIMIT_GOODS_NOTICE_RESULT(293),
    MONSTER_BATTLE_SYSTEM_RESULT(295),
    MONSTER_BATTLE_COMBAT_RESULT(296),
    UNIVERSE_BOSS_IMPOSSIBLE(298),
    CASH_SHOP_PREVIEW_INFO(299),
    CHANGE_SOUL_COLLECTIRESULT(300),
    SELECT_SOUL_COLLECTIRESULT(301),
    MASTER_PIECE_REWARD(302),
    PENDANT_SLOT_INC_RESULT(303),
    BOSS_ARENA_MATCH_SUCCESS(304),
    BOSS_ARENA_MATCH_FAIL(305),
    BOSS_ARENA_MATCH_REQUEST_DONE(306),
    USER_SOUL_MATCHING(307),
    CATAPULT_UPGRADE_SKILL(308),
    CATAPULT_RESET_SKILL(309),
    PARTY_QUEST_RANKING_RESULT(310),
    SET_COORDINATICONTEST_INFO(311),
    WORLD_TRANSFER_RESULT(312),
    TRUNK_SLOT_INC_RESULT(313),
    ELITE_MOB_WMI(314),
    RANDOM_PORTAL_NOTICE(315),
    NOTIFY_WORLD_TRANSFER_HELPER(316),
    TOP_TOWER_RANK_RESULT(318),
    FRIEND_TOWER_RANK_RESULT(319),
    TOWER_RESULT_UI_OPEN(320),
    MANNEQUIN_RESULT(321),
    IRBOX_PACKET(322),
    CREATE_KOREAN_JUMPING_GAME(323),
    CREATE_SWING_GAME(324),
    UPDATE_MAPLE_TV_SHOW_TIME(325),
    RETURN_TO_TITLE(326),
    RETURN_TO_CHARACTER_SELECT(327),
    FLAME_WIZARD_FLAME_WALK_EFFECT(328),
    FLAME_WIZARD_FLARE_BLINK(329),
    SUMMONED_AVATAR_SYNC(330),
    CASH_SHOP_EVENT_INFO(331),
    BLACK_LIST(332),
    OPEN_UI_TEST(333),
    SWITCH_BLACK_LIST_VIEW(334),
    SCROLL_UPGRADE_FEVER_TIME(335),
    TEXT_EQUIP_INFO(336),
    TEXT_EQUIP_UI_OPEN(337),
    UI_STAR_PLANET_MINI_GAME_RESULT(338),
    UI_STAR_PLANET_TREND_SHOP(339),
    UI_STAR_PLANET_MINI_GAME_QUEUE(340),
    STAR_PLANET_ROUND_INFO(342),
    STAR_PLANET_RESULT(343),
    BACK_SPEED_CTRL(344),
    SET_MAZE_AREA(345),
    CHARACTER_BURNING(346),
    BATTLE_STAT_CORE_INFO(347),
    BATTLE_STAT_CORE_ACK(348),
    GACHAPTEST_RESULT(349),
    MASTER_PIECE_TEST_RESULT(350),
    ROYAL_STYLE_TEST_RESULT(351),
    BEAUTY_COUPTEST_RESULT(352),
    NICK_SKILL_EXPIRED(353),
    RANDOM_MISSIRESULT(354),
    ON_12TH_TRESURE_RESULT(355),
    ON_12TH_TRESURE_BUFF(356),
    ITEM_COLLECTIRESULT(357),
    CHECK_COLLECTICOMPLETE_RESULT(358),
    ITEM_COLLECTILIST(359),
    RECEIVE_TOADS_HAMMER_REQUEST_RESULT(360),
    RECEIVE_HYPER_STAT_SKILL_RESET_RESULT(361),
    INVENTORY_OPERATIRESULT(362),
    GET_SAVED_URUS_SKILL(363),
    SET_ROLE_PLAYING_CHARACTER_INFO(364),
    MVP_ALARM(365),
    MONSTER_COLLECTIRESULT(366),
    TOWER_CHAIR_SETTING_RESULT(367),
    NEED_CLIENT_RESPONSE(368),
    CHARACTER_MODIFIED(369),
    TRADE_KING_SHOP_ITEM(370),
    TRADE_KING_SHOP_RES(371),
    PLAT_FORMAR_ENTER_RESULT(372),
    PLAT_FORMAR_OXYZEN(373),

    // CUser::OnPacket?
    ON_RED_CUBE_RESULT(534),
    SHOW_POTENTIAL_BLACK_CUBE(529),
    // CStage::OnPacket
    SET_FIELD(428),

    // CNpcPool::OnPacket

    // CUserLocal::OnPacket
    CHAT_MSG(720),

    // CMobPool::OnPacket
    MOB_ENTER_FIELD(908),
    MOB_LEAVE_FIELD(909),
    MOB_CHANGE_CONTROLLER(910),
    MOB_SET_AFTER_ATTACK(911),
    MOB_BLOCK_ATTACK(912),
    MOB_CRC_KEY_CHANGED(924),
    MOB_MOVE(914),
    MOB_CONTROL_ACK(915),
    MOB_STAT_SET(917),
    MOB_STAT_RESET(918),
    MOB_SUSPEND_RESET(919),
    MOB_ON_EFFECT(920),
    MOB_DAMAGED(921),
    MOB_SPECIAL_EFFECT_BY_SKILL(922),
    MOB_CRC_DATA_REQUEST(925),
    MOB_HP_INDICATOR(926),
    MOB_CATCH_EFFECT(927),
    MOB_STEAL_EFFECT(928),
    MOB_EFFECT_BY_ITEM(929),
    MOB_SPEAKING(930),
    MOB_MESSAGING(931),
    MOB_SKILL_DELAY(932),
    ESCORT_FULL_PATH(933),
    ESCORT_STOP_END_PERMISSION(934),
    ESCORT_STOP_BY_SCRIPT(935),
    ESCORT_STOP_SAY(936),
    ESCORT_RETURN_BEFORE(937),
    MOB_NEXT_ATTACK(938),
    ;

    private short value;

    OutHeader(int value) {
        this.value = (short) value;
    }

    public short getValue() {
        return value;
    }

    public static OutHeader getOutHeaderByOp(int op) {
        for (OutHeader outHeader : OutHeader.values()) {
            if (outHeader.getValue() == op) {
                return outHeader;
            }
        }
        return null;
    }

    public static boolean isSpamHeader(OutHeader outHeader) {
        List<OutHeader> spam = Arrays.asList(
                PING,
                HEARTBEAT_RESPONSE,
                MOB_CONTROL_ACK

                );
        return spam.contains(outHeader);
    }

}
