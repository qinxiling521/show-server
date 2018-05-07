/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package one.show.stat.thrift.view;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserStatView implements org.apache.thrift.TBase<UserStatView, UserStatView._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserStatView");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField FANS_FIELD_DESC = new org.apache.thrift.protocol.TField("fans", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FOLLOW_FIELD_DESC = new org.apache.thrift.protocol.TField("follow", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField LOGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("login", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField VIDEOS_FIELD_DESC = new org.apache.thrift.protocol.TField("videos", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField VIEWED_FIELD_DESC = new org.apache.thrift.protocol.TField("viewed", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField RECEIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("receive", org.apache.thrift.protocol.TType.DOUBLE, (short)7);
  private static final org.apache.thrift.protocol.TField SPEND_FIELD_DESC = new org.apache.thrift.protocol.TField("spend", org.apache.thrift.protocol.TType.DOUBLE, (short)8);
  private static final org.apache.thrift.protocol.TField RECEIVE_EXP_FIELD_DESC = new org.apache.thrift.protocol.TField("receiveExp", org.apache.thrift.protocol.TType.DOUBLE, (short)9);
  private static final org.apache.thrift.protocol.TField SPEND_EXP_FIELD_DESC = new org.apache.thrift.protocol.TField("spendExp", org.apache.thrift.protocol.TType.DOUBLE, (short)10);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserStatViewStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserStatViewTupleSchemeFactory());
  }

  public long uid; // required
  public int fans; // required
  public int follow; // required
  public int login; // required
  public int videos; // required
  public int viewed; // required
  public double receive; // required
  public double spend; // required
  public double receiveExp; // required
  public double spendExp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    FANS((short)2, "fans"),
    FOLLOW((short)3, "follow"),
    LOGIN((short)4, "login"),
    VIDEOS((short)5, "videos"),
    VIEWED((short)6, "viewed"),
    RECEIVE((short)7, "receive"),
    SPEND((short)8, "spend"),
    RECEIVE_EXP((short)9, "receiveExp"),
    SPEND_EXP((short)10, "spendExp");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // UID
          return UID;
        case 2: // FANS
          return FANS;
        case 3: // FOLLOW
          return FOLLOW;
        case 4: // LOGIN
          return LOGIN;
        case 5: // VIDEOS
          return VIDEOS;
        case 6: // VIEWED
          return VIEWED;
        case 7: // RECEIVE
          return RECEIVE;
        case 8: // SPEND
          return SPEND;
        case 9: // RECEIVE_EXP
          return RECEIVE_EXP;
        case 10: // SPEND_EXP
          return SPEND_EXP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __UID_ISSET_ID = 0;
  private static final int __FANS_ISSET_ID = 1;
  private static final int __FOLLOW_ISSET_ID = 2;
  private static final int __LOGIN_ISSET_ID = 3;
  private static final int __VIDEOS_ISSET_ID = 4;
  private static final int __VIEWED_ISSET_ID = 5;
  private static final int __RECEIVE_ISSET_ID = 6;
  private static final int __SPEND_ISSET_ID = 7;
  private static final int __RECEIVEEXP_ISSET_ID = 8;
  private static final int __SPENDEXP_ISSET_ID = 9;
  private short __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FANS, new org.apache.thrift.meta_data.FieldMetaData("fans", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FOLLOW, new org.apache.thrift.meta_data.FieldMetaData("follow", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LOGIN, new org.apache.thrift.meta_data.FieldMetaData("login", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VIDEOS, new org.apache.thrift.meta_data.FieldMetaData("videos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VIEWED, new org.apache.thrift.meta_data.FieldMetaData("viewed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECEIVE, new org.apache.thrift.meta_data.FieldMetaData("receive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SPEND, new org.apache.thrift.meta_data.FieldMetaData("spend", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.RECEIVE_EXP, new org.apache.thrift.meta_data.FieldMetaData("receiveExp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SPEND_EXP, new org.apache.thrift.meta_data.FieldMetaData("spendExp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserStatView.class, metaDataMap);
  }

  public UserStatView() {
  }

  public UserStatView(
    long uid,
    int fans,
    int follow,
    int login,
    int videos,
    int viewed,
    double receive,
    double spend,
    double receiveExp,
    double spendExp)
  {
    this();
    this.uid = uid;
    setUidIsSet(true);
    this.fans = fans;
    setFansIsSet(true);
    this.follow = follow;
    setFollowIsSet(true);
    this.login = login;
    setLoginIsSet(true);
    this.videos = videos;
    setVideosIsSet(true);
    this.viewed = viewed;
    setViewedIsSet(true);
    this.receive = receive;
    setReceiveIsSet(true);
    this.spend = spend;
    setSpendIsSet(true);
    this.receiveExp = receiveExp;
    setReceiveExpIsSet(true);
    this.spendExp = spendExp;
    setSpendExpIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserStatView(UserStatView other) {
    __isset_bitfield = other.__isset_bitfield;
    this.uid = other.uid;
    this.fans = other.fans;
    this.follow = other.follow;
    this.login = other.login;
    this.videos = other.videos;
    this.viewed = other.viewed;
    this.receive = other.receive;
    this.spend = other.spend;
    this.receiveExp = other.receiveExp;
    this.spendExp = other.spendExp;
  }

  public UserStatView deepCopy() {
    return new UserStatView(this);
  }

  @Override
  public void clear() {
    setUidIsSet(false);
    this.uid = 0;
    setFansIsSet(false);
    this.fans = 0;
    setFollowIsSet(false);
    this.follow = 0;
    setLoginIsSet(false);
    this.login = 0;
    setVideosIsSet(false);
    this.videos = 0;
    setViewedIsSet(false);
    this.viewed = 0;
    setReceiveIsSet(false);
    this.receive = 0.0;
    setSpendIsSet(false);
    this.spend = 0.0;
    setReceiveExpIsSet(false);
    this.receiveExp = 0.0;
    setSpendExpIsSet(false);
    this.spendExp = 0.0;
  }

  public long getUid() {
    return this.uid;
  }

  public UserStatView setUid(long uid) {
    this.uid = uid;
    setUidIsSet(true);
    return this;
  }

  public void unsetUid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UID_ISSET_ID);
  }

  /** Returns true if field uid is set (has been assigned a value) and false otherwise */
  public boolean isSetUid() {
    return EncodingUtils.testBit(__isset_bitfield, __UID_ISSET_ID);
  }

  public void setUidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UID_ISSET_ID, value);
  }

  public int getFans() {
    return this.fans;
  }

  public UserStatView setFans(int fans) {
    this.fans = fans;
    setFansIsSet(true);
    return this;
  }

  public void unsetFans() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FANS_ISSET_ID);
  }

  /** Returns true if field fans is set (has been assigned a value) and false otherwise */
  public boolean isSetFans() {
    return EncodingUtils.testBit(__isset_bitfield, __FANS_ISSET_ID);
  }

  public void setFansIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FANS_ISSET_ID, value);
  }

  public int getFollow() {
    return this.follow;
  }

  public UserStatView setFollow(int follow) {
    this.follow = follow;
    setFollowIsSet(true);
    return this;
  }

  public void unsetFollow() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FOLLOW_ISSET_ID);
  }

  /** Returns true if field follow is set (has been assigned a value) and false otherwise */
  public boolean isSetFollow() {
    return EncodingUtils.testBit(__isset_bitfield, __FOLLOW_ISSET_ID);
  }

  public void setFollowIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FOLLOW_ISSET_ID, value);
  }

  public int getLogin() {
    return this.login;
  }

  public UserStatView setLogin(int login) {
    this.login = login;
    setLoginIsSet(true);
    return this;
  }

  public void unsetLogin() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOGIN_ISSET_ID);
  }

  /** Returns true if field login is set (has been assigned a value) and false otherwise */
  public boolean isSetLogin() {
    return EncodingUtils.testBit(__isset_bitfield, __LOGIN_ISSET_ID);
  }

  public void setLoginIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOGIN_ISSET_ID, value);
  }

  public int getVideos() {
    return this.videos;
  }

  public UserStatView setVideos(int videos) {
    this.videos = videos;
    setVideosIsSet(true);
    return this;
  }

  public void unsetVideos() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VIDEOS_ISSET_ID);
  }

  /** Returns true if field videos is set (has been assigned a value) and false otherwise */
  public boolean isSetVideos() {
    return EncodingUtils.testBit(__isset_bitfield, __VIDEOS_ISSET_ID);
  }

  public void setVideosIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VIDEOS_ISSET_ID, value);
  }

  public int getViewed() {
    return this.viewed;
  }

  public UserStatView setViewed(int viewed) {
    this.viewed = viewed;
    setViewedIsSet(true);
    return this;
  }

  public void unsetViewed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VIEWED_ISSET_ID);
  }

  /** Returns true if field viewed is set (has been assigned a value) and false otherwise */
  public boolean isSetViewed() {
    return EncodingUtils.testBit(__isset_bitfield, __VIEWED_ISSET_ID);
  }

  public void setViewedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VIEWED_ISSET_ID, value);
  }

  public double getReceive() {
    return this.receive;
  }

  public UserStatView setReceive(double receive) {
    this.receive = receive;
    setReceiveIsSet(true);
    return this;
  }

  public void unsetReceive() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECEIVE_ISSET_ID);
  }

  /** Returns true if field receive is set (has been assigned a value) and false otherwise */
  public boolean isSetReceive() {
    return EncodingUtils.testBit(__isset_bitfield, __RECEIVE_ISSET_ID);
  }

  public void setReceiveIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECEIVE_ISSET_ID, value);
  }

  public double getSpend() {
    return this.spend;
  }

  public UserStatView setSpend(double spend) {
    this.spend = spend;
    setSpendIsSet(true);
    return this;
  }

  public void unsetSpend() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SPEND_ISSET_ID);
  }

  /** Returns true if field spend is set (has been assigned a value) and false otherwise */
  public boolean isSetSpend() {
    return EncodingUtils.testBit(__isset_bitfield, __SPEND_ISSET_ID);
  }

  public void setSpendIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SPEND_ISSET_ID, value);
  }

  public double getReceiveExp() {
    return this.receiveExp;
  }

  public UserStatView setReceiveExp(double receiveExp) {
    this.receiveExp = receiveExp;
    setReceiveExpIsSet(true);
    return this;
  }

  public void unsetReceiveExp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECEIVEEXP_ISSET_ID);
  }

  /** Returns true if field receiveExp is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiveExp() {
    return EncodingUtils.testBit(__isset_bitfield, __RECEIVEEXP_ISSET_ID);
  }

  public void setReceiveExpIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECEIVEEXP_ISSET_ID, value);
  }

  public double getSpendExp() {
    return this.spendExp;
  }

  public UserStatView setSpendExp(double spendExp) {
    this.spendExp = spendExp;
    setSpendExpIsSet(true);
    return this;
  }

  public void unsetSpendExp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SPENDEXP_ISSET_ID);
  }

  /** Returns true if field spendExp is set (has been assigned a value) and false otherwise */
  public boolean isSetSpendExp() {
    return EncodingUtils.testBit(__isset_bitfield, __SPENDEXP_ISSET_ID);
  }

  public void setSpendExpIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SPENDEXP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((Long)value);
      }
      break;

    case FANS:
      if (value == null) {
        unsetFans();
      } else {
        setFans((Integer)value);
      }
      break;

    case FOLLOW:
      if (value == null) {
        unsetFollow();
      } else {
        setFollow((Integer)value);
      }
      break;

    case LOGIN:
      if (value == null) {
        unsetLogin();
      } else {
        setLogin((Integer)value);
      }
      break;

    case VIDEOS:
      if (value == null) {
        unsetVideos();
      } else {
        setVideos((Integer)value);
      }
      break;

    case VIEWED:
      if (value == null) {
        unsetViewed();
      } else {
        setViewed((Integer)value);
      }
      break;

    case RECEIVE:
      if (value == null) {
        unsetReceive();
      } else {
        setReceive((Double)value);
      }
      break;

    case SPEND:
      if (value == null) {
        unsetSpend();
      } else {
        setSpend((Double)value);
      }
      break;

    case RECEIVE_EXP:
      if (value == null) {
        unsetReceiveExp();
      } else {
        setReceiveExp((Double)value);
      }
      break;

    case SPEND_EXP:
      if (value == null) {
        unsetSpendExp();
      } else {
        setSpendExp((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return Long.valueOf(getUid());

    case FANS:
      return Integer.valueOf(getFans());

    case FOLLOW:
      return Integer.valueOf(getFollow());

    case LOGIN:
      return Integer.valueOf(getLogin());

    case VIDEOS:
      return Integer.valueOf(getVideos());

    case VIEWED:
      return Integer.valueOf(getViewed());

    case RECEIVE:
      return Double.valueOf(getReceive());

    case SPEND:
      return Double.valueOf(getSpend());

    case RECEIVE_EXP:
      return Double.valueOf(getReceiveExp());

    case SPEND_EXP:
      return Double.valueOf(getSpendExp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UID:
      return isSetUid();
    case FANS:
      return isSetFans();
    case FOLLOW:
      return isSetFollow();
    case LOGIN:
      return isSetLogin();
    case VIDEOS:
      return isSetVideos();
    case VIEWED:
      return isSetViewed();
    case RECEIVE:
      return isSetReceive();
    case SPEND:
      return isSetSpend();
    case RECEIVE_EXP:
      return isSetReceiveExp();
    case SPEND_EXP:
      return isSetSpendExp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserStatView)
      return this.equals((UserStatView)that);
    return false;
  }

  public boolean equals(UserStatView that) {
    if (that == null)
      return false;

    boolean this_present_uid = true;
    boolean that_present_uid = true;
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (this.uid != that.uid)
        return false;
    }

    boolean this_present_fans = true;
    boolean that_present_fans = true;
    if (this_present_fans || that_present_fans) {
      if (!(this_present_fans && that_present_fans))
        return false;
      if (this.fans != that.fans)
        return false;
    }

    boolean this_present_follow = true;
    boolean that_present_follow = true;
    if (this_present_follow || that_present_follow) {
      if (!(this_present_follow && that_present_follow))
        return false;
      if (this.follow != that.follow)
        return false;
    }

    boolean this_present_login = true;
    boolean that_present_login = true;
    if (this_present_login || that_present_login) {
      if (!(this_present_login && that_present_login))
        return false;
      if (this.login != that.login)
        return false;
    }

    boolean this_present_videos = true;
    boolean that_present_videos = true;
    if (this_present_videos || that_present_videos) {
      if (!(this_present_videos && that_present_videos))
        return false;
      if (this.videos != that.videos)
        return false;
    }

    boolean this_present_viewed = true;
    boolean that_present_viewed = true;
    if (this_present_viewed || that_present_viewed) {
      if (!(this_present_viewed && that_present_viewed))
        return false;
      if (this.viewed != that.viewed)
        return false;
    }

    boolean this_present_receive = true;
    boolean that_present_receive = true;
    if (this_present_receive || that_present_receive) {
      if (!(this_present_receive && that_present_receive))
        return false;
      if (this.receive != that.receive)
        return false;
    }

    boolean this_present_spend = true;
    boolean that_present_spend = true;
    if (this_present_spend || that_present_spend) {
      if (!(this_present_spend && that_present_spend))
        return false;
      if (this.spend != that.spend)
        return false;
    }

    boolean this_present_receiveExp = true;
    boolean that_present_receiveExp = true;
    if (this_present_receiveExp || that_present_receiveExp) {
      if (!(this_present_receiveExp && that_present_receiveExp))
        return false;
      if (this.receiveExp != that.receiveExp)
        return false;
    }

    boolean this_present_spendExp = true;
    boolean that_present_spendExp = true;
    if (this_present_spendExp || that_present_spendExp) {
      if (!(this_present_spendExp && that_present_spendExp))
        return false;
      if (this.spendExp != that.spendExp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(UserStatView other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    UserStatView typedOther = (UserStatView)other;

    lastComparison = Boolean.valueOf(isSetUid()).compareTo(typedOther.isSetUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, typedOther.uid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFans()).compareTo(typedOther.isSetFans());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFans()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fans, typedOther.fans);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFollow()).compareTo(typedOther.isSetFollow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFollow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.follow, typedOther.follow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLogin()).compareTo(typedOther.isSetLogin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.login, typedOther.login);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVideos()).compareTo(typedOther.isSetVideos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVideos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.videos, typedOther.videos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetViewed()).compareTo(typedOther.isSetViewed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViewed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.viewed, typedOther.viewed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceive()).compareTo(typedOther.isSetReceive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receive, typedOther.receive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpend()).compareTo(typedOther.isSetSpend());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpend()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spend, typedOther.spend);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceiveExp()).compareTo(typedOther.isSetReceiveExp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiveExp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receiveExp, typedOther.receiveExp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpendExp()).compareTo(typedOther.isSetSpendExp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpendExp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spendExp, typedOther.spendExp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UserStatView(");
    boolean first = true;

    sb.append("uid:");
    sb.append(this.uid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("fans:");
    sb.append(this.fans);
    first = false;
    if (!first) sb.append(", ");
    sb.append("follow:");
    sb.append(this.follow);
    first = false;
    if (!first) sb.append(", ");
    sb.append("login:");
    sb.append(this.login);
    first = false;
    if (!first) sb.append(", ");
    sb.append("videos:");
    sb.append(this.videos);
    first = false;
    if (!first) sb.append(", ");
    sb.append("viewed:");
    sb.append(this.viewed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("receive:");
    sb.append(this.receive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("spend:");
    sb.append(this.spend);
    first = false;
    if (!first) sb.append(", ");
    sb.append("receiveExp:");
    sb.append(this.receiveExp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("spendExp:");
    sb.append(this.spendExp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserStatViewStandardSchemeFactory implements SchemeFactory {
    public UserStatViewStandardScheme getScheme() {
      return new UserStatViewStandardScheme();
    }
  }

  private static class UserStatViewStandardScheme extends StandardScheme<UserStatView> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserStatView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.uid = iprot.readI64();
              struct.setUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FANS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fans = iprot.readI32();
              struct.setFansIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FOLLOW
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.follow = iprot.readI32();
              struct.setFollowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.login = iprot.readI32();
              struct.setLoginIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VIDEOS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.videos = iprot.readI32();
              struct.setVideosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VIEWED
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.viewed = iprot.readI32();
              struct.setViewedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // RECEIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.receive = iprot.readDouble();
              struct.setReceiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // SPEND
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.spend = iprot.readDouble();
              struct.setSpendIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // RECEIVE_EXP
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.receiveExp = iprot.readDouble();
              struct.setReceiveExpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // SPEND_EXP
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.spendExp = iprot.readDouble();
              struct.setSpendExpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserStatView struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(UID_FIELD_DESC);
      oprot.writeI64(struct.uid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FANS_FIELD_DESC);
      oprot.writeI32(struct.fans);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FOLLOW_FIELD_DESC);
      oprot.writeI32(struct.follow);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOGIN_FIELD_DESC);
      oprot.writeI32(struct.login);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VIDEOS_FIELD_DESC);
      oprot.writeI32(struct.videos);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VIEWED_FIELD_DESC);
      oprot.writeI32(struct.viewed);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECEIVE_FIELD_DESC);
      oprot.writeDouble(struct.receive);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SPEND_FIELD_DESC);
      oprot.writeDouble(struct.spend);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECEIVE_EXP_FIELD_DESC);
      oprot.writeDouble(struct.receiveExp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SPEND_EXP_FIELD_DESC);
      oprot.writeDouble(struct.spendExp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserStatViewTupleSchemeFactory implements SchemeFactory {
    public UserStatViewTupleScheme getScheme() {
      return new UserStatViewTupleScheme();
    }
  }

  private static class UserStatViewTupleScheme extends TupleScheme<UserStatView> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserStatView struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetFans()) {
        optionals.set(1);
      }
      if (struct.isSetFollow()) {
        optionals.set(2);
      }
      if (struct.isSetLogin()) {
        optionals.set(3);
      }
      if (struct.isSetVideos()) {
        optionals.set(4);
      }
      if (struct.isSetViewed()) {
        optionals.set(5);
      }
      if (struct.isSetReceive()) {
        optionals.set(6);
      }
      if (struct.isSetSpend()) {
        optionals.set(7);
      }
      if (struct.isSetReceiveExp()) {
        optionals.set(8);
      }
      if (struct.isSetSpendExp()) {
        optionals.set(9);
      }
      oprot.writeBitSet(optionals, 10);
      if (struct.isSetUid()) {
        oprot.writeI64(struct.uid);
      }
      if (struct.isSetFans()) {
        oprot.writeI32(struct.fans);
      }
      if (struct.isSetFollow()) {
        oprot.writeI32(struct.follow);
      }
      if (struct.isSetLogin()) {
        oprot.writeI32(struct.login);
      }
      if (struct.isSetVideos()) {
        oprot.writeI32(struct.videos);
      }
      if (struct.isSetViewed()) {
        oprot.writeI32(struct.viewed);
      }
      if (struct.isSetReceive()) {
        oprot.writeDouble(struct.receive);
      }
      if (struct.isSetSpend()) {
        oprot.writeDouble(struct.spend);
      }
      if (struct.isSetReceiveExp()) {
        oprot.writeDouble(struct.receiveExp);
      }
      if (struct.isSetSpendExp()) {
        oprot.writeDouble(struct.spendExp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserStatView struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(10);
      if (incoming.get(0)) {
        struct.uid = iprot.readI64();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.fans = iprot.readI32();
        struct.setFansIsSet(true);
      }
      if (incoming.get(2)) {
        struct.follow = iprot.readI32();
        struct.setFollowIsSet(true);
      }
      if (incoming.get(3)) {
        struct.login = iprot.readI32();
        struct.setLoginIsSet(true);
      }
      if (incoming.get(4)) {
        struct.videos = iprot.readI32();
        struct.setVideosIsSet(true);
      }
      if (incoming.get(5)) {
        struct.viewed = iprot.readI32();
        struct.setViewedIsSet(true);
      }
      if (incoming.get(6)) {
        struct.receive = iprot.readDouble();
        struct.setReceiveIsSet(true);
      }
      if (incoming.get(7)) {
        struct.spend = iprot.readDouble();
        struct.setSpendIsSet(true);
      }
      if (incoming.get(8)) {
        struct.receiveExp = iprot.readDouble();
        struct.setReceiveExpIsSet(true);
      }
      if (incoming.get(9)) {
        struct.spendExp = iprot.readDouble();
        struct.setSpendExpIsSet(true);
      }
    }
  }

}

